package com.leosam.police.controller;

import com.leosam.police.entity.Phone;
import com.leosam.police.entity.PoliceCase;
import com.leosam.police.entity.Suspect;
import com.leosam.police.service.PoliceCaseService;
import com.leosam.police.utis.ResultVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = {"/case"})
public class PoliceController {
	private static final Logger logger = LoggerFactory.getLogger(PoliceController.class);

	@Autowired
	private PoliceCaseService policeCaseService;

	@RequestMapping(value = {"", "/", "/index", "/index.html", "/case.html"})
	public String page(HttpServletRequest request) {
		return "case/index";
	}

	@RequestMapping("/listPoliceCase")
	@ResponseBody
	public ResultVO<PoliceCase> contentPageList(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit", defaultValue = "100") int limit, PoliceCase policeCase) {
		ResultVO<PoliceCase> policeCaseResultVO = policeCaseService.listPoliceCase(page, limit, policeCase);
		return policeCaseResultVO;
	}

	@RequestMapping("/policeCaseMod.html")
	public String policeCaseModPage(HttpServletRequest request, String caseId) {
		PoliceCase policeCase = null;
		try {
			if (StringUtils.isBlank(caseId)) {
				caseId = null;
			}
			policeCase = policeCaseService.getPoliceCase(caseId);
		} catch (Exception e) {
			logger.error("PoliceController policeCaseMod.html", e);
		}
		request.setAttribute("policeCase", policeCase);
		request.setAttribute("caseId", caseId);
		return "case/policeCaseMod";
	}
	@RequestMapping("/policeCaseMod")
	@ResponseBody
	public ResultVO policeCaseMod(HttpServletRequest request, String caseId, @RequestBody(required = false) PoliceCase policeCase) {
		try {
			return policeCaseService.policeCaseMod(caseId, policeCase);
		} catch (Exception e) {
			logger.error("SystemController userMod ", e);
		}
		return ResultVO.ERROR;
	}

	@RequestMapping(value = {  "/phone.html"})
	public String phone(HttpServletRequest request) {
		return "case/phone";
	}

	@RequestMapping("/listPhone")
	@ResponseBody
	public ResultVO<Phone> listPhone(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit", defaultValue = "100") int limit, Phone phone) {
		ResultVO<Phone> resultVO = policeCaseService.listPhone(page, limit, phone);
		return resultVO;
	}

	@RequestMapping("/phoneMod.html")
	public String phoneModPage(HttpServletRequest request, Integer phoneId) {
		Phone phone = null;
		try {

			if (phoneId == null || phoneId == 0) {
				phoneId = null;
			}
			phone = policeCaseService.getPhone(phoneId);
		} catch (Exception e) {
			logger.error("PoliceController phoneMod.html", e);
		}
		request.setAttribute("phone", phone);
		request.setAttribute("phoneId", phoneId);
		return "case/phoneMod";
	}
	@RequestMapping("/phoneMod")
	@ResponseBody
	public ResultVO phoneMod(HttpServletRequest request, Integer phoneId, @RequestBody(required = false) Phone phone) {
		try {
			return policeCaseService.phoneMod(phoneId, phone);
		} catch (Exception e) {
			logger.error("SystemController phoneMod ", e);
		}
		return ResultVO.ERROR;
	}

	@RequestMapping(value = {  "/suspect.html"})
	public String suspect(HttpServletRequest request) {
		return "case/suspect";
	}


	@RequestMapping("/listSuspect")
	@ResponseBody
	public ResultVO<Suspect> listSuspect(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit", defaultValue = "100") int limit, Suspect suspect) {
		ResultVO<Suspect> resultVO = policeCaseService.listSuspect(page, limit, suspect);
		return resultVO;
	}

	@RequestMapping("/suspectMod.html")
	public String suspectModPage(HttpServletRequest request, Integer suspectId) {
		Suspect suspect = null;
		try {
			if (suspectId == null || suspectId == 0) {
				suspectId = null;
			}

			suspect = policeCaseService.getSuspect(suspectId);
		} catch (Exception e) {
			logger.error("PoliceController phoneMod.html", e);
		}
		request.setAttribute("suspect", suspect);
		request.setAttribute("suspectId", suspectId);
		return "case/suspectMod";
	}
	@RequestMapping("/suspectMod")
	@ResponseBody
	public ResultVO suspectMod(HttpServletRequest request, Integer suspectId, @RequestBody(required = false) Suspect suspect) {
		try {
			return policeCaseService.suspectMod(suspectId, suspect);
		} catch (Exception e) {
			logger.error("SystemController phoneMod ", e);
		}
		return ResultVO.ERROR;
	}
}
