package br.com.erudio.restwithspringbootudemy.controller;

import br.com.erudio.restwithspringbootudemy.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class MathController {

    @GetMapping(value = "/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
        try{
            var sum = Double.parseDouble(numberOne) + Double.parseDouble(numberTwo);
            return sum;
        }catch (Exception e){
            throw new UnsupportedMathOperationException("Please set a numeric value, without comma ");
        }
    }

    @GetMapping(value = "/sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
        try{
            var sub = Double.parseDouble(numberOne) - Double.parseDouble(numberTwo);
            return sub;
        }catch (Exception e){
            throw new UnsupportedMathOperationException("Please set a numeric value, without comma ");
        }
    }

    @GetMapping(value = "/mult/{numberOne}/{numberTwo}")
    public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        try {
            var mult = Double.parseDouble(numberOne) * Double.parseDouble(numberTwo);
            return mult;
        } catch (Exception e) {
            throw new UnsupportedMathOperationException("Please set a numeric value, without comma ");
        }
    }

    @GetMapping(value = "/div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        try {
            var div = Double.parseDouble(numberOne) / Double.parseDouble(numberTwo);
            return div;
        } catch (NumberFormatException e) {
            throw new UnsupportedMathOperationException("Please set a numeric value, without comma ");
        }
    }

    @GetMapping(value = "/sqrt/{number}")
    public Double sqrt(@PathVariable("number") String number) {
        try {
            var sqrt = Math.sqrt(Double.parseDouble(number));
            return sqrt;
        } catch (Exception e) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
    }

    @GetMapping(value = "/avg/{numberOne}/{numberTwo}")
    public Double avg(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        try {
            var avg = (Double.parseDouble(numberOne) + Double.parseDouble(numberTwo))/2;
            return avg;
        } catch (Exception e) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
    }

}
