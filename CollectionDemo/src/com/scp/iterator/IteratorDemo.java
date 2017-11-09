package com.scp.iterator;

import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
  public static <T extends Collection<? extends Object>>void myIterator(T t) {
      Iterator<? extends Object> itr= t.iterator();
      
      while(itr.hasNext()) {
    	  Object o=(Object)itr.next();
    	  if(o instanceof Student) {
    		  System.out.println(o.toString());
    	  }else if(o instanceof Product) {
    		  System.out.println(o.toString());
    	  }else {
    		  System.out.println(o.toString());
    	  }
    	  
      }
    
  }
}
