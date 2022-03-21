package net.springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.springboot.entity.Product;
import net.springboot.repository.ProductRepository;

@Controller
@RequestMapping("/products/")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;	
	
	@GetMapping("showForm")
	public String showProuctForm(Product product) {
		return "add-product";
	}
	
	@GetMapping("list")
	public String products(Model model) {
		model.addAttribute("products", this.productRepository.findAll());
		return "index";
	}
	
	@PostMapping("add")
	public String addProduct(@Valid Product product, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add-product";
		}
		
		this.productRepository.save(product);
		return "redirect:list";
	}
	
	
	@GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable ("id") long id, Model model) {
		Product product = this.productRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid product id : " + id));
		
		model.addAttribute("product", product);
		return "update-product";
	}
	
	@PostMapping("update/{id}")
	public String updateProduct(@PathVariable("id") long id, @Valid Product product, BindingResult result, Model model) {
		if(result.hasErrors()) {
			product.setId(id);
			return "update-product";
		}
		
		// update product
		productRepository.save(product);
		
		// get all products ( with update)
		model.addAttribute("products", this.productRepository.findAll());
		return "index";
	}
	
	@GetMapping("delete/{id}")
	public String deleteProduct(@PathVariable ("id") long id, Model model) {
		
		Product product = this.productRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid product id : " + id));
		
		this.productRepository.delete(product);
		model.addAttribute("products", this.productRepository.findAll());
		return "index";
		
	}
}
