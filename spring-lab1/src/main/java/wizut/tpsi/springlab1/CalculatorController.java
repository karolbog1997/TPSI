package wizut.tpsi.springlab1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {

    @RequestMapping("/add1")
    public String add1(Model model, Integer a, Integer b) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("result", a + b);
        return "add1";
    }

    @RequestMapping("/add2")
    public String add2(Model model, Integer a, Integer b, String wybor) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("wybor", wybor);

        if(wybor.equals("+")) {
            model.addAttribute("result", a + b);
        }
        else if(wybor.equals("-")) {
            model.addAttribute("result", a - b);
        }
        else if(wybor.equals("*")) {
            model.addAttribute("result", a * b);
        }
        else {
            model.addAttribute("result", "blad" );
        }
        return "add2";
    }
    @RequestMapping("/add3")
    public String add3(Model model, CalculatorForm add1) {

        model.addAttribute("a", add1.get_a());
        model.addAttribute("b", add1.get_b());
        model.addAttribute("wybor", add1.get_Wybor());

        model.addAttribute("result", "blad" );

            /*
            model.addAttribute("add1", add1);

            if(add1.get_Wybor().equals("+")) {

                //model.addAttribute("result", add1.get_a() + add1.get_b());
            }
            else if(add1.get_Wybor().equals("-")) {
                model.addAttribute("result", add1.get_a() - add1.get_b());
            }
            else if(add1.get_Wybor().equals("*")) {
                model.addAttribute("result", add1.get_a() * add1.get_b());
            }

         */

            return "add3";
    }


}
