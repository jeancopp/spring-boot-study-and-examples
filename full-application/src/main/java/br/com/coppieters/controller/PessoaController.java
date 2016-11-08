package br.com.coppieters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.coppieters.model.Pessoa;
import br.com.coppieters.repository.PessoaRepository;

@Controller
public class PessoaController {

	@Autowired
	PessoaRepository repositorio;

	@RequestMapping("/")
	public String inicio() {
		return "index";
	}

	@RequestMapping(value = "/listapessoas", method = RequestMethod.GET)
	public ModelAndView listapessoa() {
		Iterable<Pessoa> pessoas = repositorio.findAll();
		ModelAndView mv = new ModelAndView("listapessoas");
		mv.addObject("pessoas", pessoas);
		return mv;
	}

	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public ModelAndView salvar(Pessoa pessoa) {
		repositorio.save(pessoa);
		return new ModelAndView("redirect:/listapessoas");
	}

}
