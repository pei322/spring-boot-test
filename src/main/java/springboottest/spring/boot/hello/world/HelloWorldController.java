package springboottest.spring.boot.hello.world;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello1")
	  public String hello1() {
	    return "Hello World";
	  }

	  @RequestMapping("/hello2")
	  public List<String> hello2() {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		return list;
	    //return Arrays.asList(new String[] { "A", "B", "C" });
	  }
	  
	  @RequestMapping("/hello3")
	  public String hello3(@RequestParam String idx) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		return list.get(Integer.parseInt(idx));
	    //return Arrays.asList(new String[] { "A", "B", "C" });
	  }
	  
	  @RequestMapping("/hello4/{idx}")
	  public String hello4(@PathVariable String idx) {
		  List<String> list = new ArrayList<String>();
		  list.add("A");
		  list.add("B");
		  list.add("C");
		  return list.get(Integer.parseInt(idx));
		  //return Arrays.asList(new String[] { "A", "B", "C" });
	  }
	  
}
