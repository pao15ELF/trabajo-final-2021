package ar.edu.unju.fi.TPFinal.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.TPFinal.model.ProductLine;
import ar.edu.unju.fi.TPFinal.repository.IProductLineRepository;
import ar.edu.unju.fi.TPFinal.repository.IProductRepository;
import ar.edu.unju.fi.TPFinal.service.IProductLineService;

@Service("productLineServiceImp")
public class ProductLineServiceImp implements IProductLineService{

	@Autowired
	private IProductLineRepository productLineRepository;
	
	@Override
	public void guardarProductLine(ProductLine productLine) {
		productLineRepository.save(productLine);
		
	}

	@Override
	public ProductLine buscarProductLinePorId(String id) {
		
		ProductLine marca = productLineRepository.findById(id).get();
		
		return marca;
	}

	
}