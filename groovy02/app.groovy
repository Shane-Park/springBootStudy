@Controller
class App{
    @RequestMapping("/")
    @ResponseBody
    def home(ModelAndView mv){
        mv.setViewName("index")
        mv
    }
}