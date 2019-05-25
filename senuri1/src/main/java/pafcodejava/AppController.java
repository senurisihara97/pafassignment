package pafcodejava;


@Controller
public class AppController {
	
	@Autowired
	private productservice service;
	
	
	@RequestMapping("/")
	public string viewHomePage(Model model) {
		List<product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		
		
		
		return"index";
		
		
		
		
	}

}
