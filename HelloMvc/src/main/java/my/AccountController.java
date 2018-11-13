package my;

import java.io.IOException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
	
	@GetMapping(path="/get")
	public String sayHello()
	{
		return "MSG";
	}
	@PostMapping(path="/post/{name}")
	public String newMsg(@PathVariable("name")String name)
	{
		return "MSG"+name;
	}
	@RequestMapping(path="/post/{name}",method=RequestMethod.GET)
	
	public ModelAndView listItem(@PathVariable("name")String name)
	{
		if(name.length()<2) {
			throw new NullPointerException();
		}
		if(name.equals("list")) {
			throw new ArithmeticException();
		}
		
		ModelAndView mv=new ModelAndView();
		ArrayList<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		mv.setViewName("record");
		mv.addObject("list",al);
		return mv;
	}

	@ExceptionHandler(NullPointerException.class)
	public void handelException(HttpServletResponse res)
	{
		try {
			res.sendRedirect("http://google.com");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Autowired
	AccountServiceImpl impl;
	
	@RequestMapping(path="/getPage",method=RequestMethod.GET)
	public String sayHello(@ModelAttribute("e") Employee e)
	{
		return "display";
	}
	
	@RequestMapping(path="/getrecord",method=RequestMethod.POST)
	public ModelAndView newEmployee( @ModelAttribute("e") @Valid Employee e,BindingResult result)
	{
		ModelAndView  mv=new ModelAndView();
		mv.setViewName("display");
		String name=impl.newRecord(e, result);
		if(result.hasErrors())
			return mv;
		mv.setViewName("record");
		return mv;
	}
	/*
	@Transactional
	@RequestMapping(path="/read/{id}",method=RequestMethod.GET)
	public ModelAndView reademployee(@PathVariable("id")int id)
	{
		Employee e=impl.readTable(id);
		ModelAndView  mv=new ModelAndView();
		mv.setViewName("record");
		mv.addObject("key", e);
		System.out.println(e.getAge()+"         "+e.getName());
		return mv;
		
	}
*/
}
