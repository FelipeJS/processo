package br.org.hugol.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository;

	public Paciente obterPaciente(Integer cdPaciente) {
		return pacienteRepository.findOne(cdPaciente);
	}

	public Iterable<Paciente> obterTodos() {
		return pacienteRepository.findAll();
	}
	
}