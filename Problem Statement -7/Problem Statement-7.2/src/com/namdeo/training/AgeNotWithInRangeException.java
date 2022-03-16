package com.namdeo.training;

class AgeNotWithInRangeException extends Exception
{
     public String toString()
     {
          return ("Age is not between 15 and 21. please ReEnter the Age");
     }
}