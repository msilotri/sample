package uk.gov.dwp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the selection of calculation
 * @author samba.mitra
 */
@Controller
public class SelectCalculationController {

	private static final Logger logger = LoggerFactory.getLogger(SelectCalculationController.class);

	// Select Calculation

	@RequestMapping(value = "/admin/select_calculation", method = RequestMethod.GET)
	public String showSelectCalculation(Model model) {
		logger.info("Displaying Select Calculation page...");
		return "select_calculation";
	}
}
