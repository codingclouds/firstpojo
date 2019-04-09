package com.leosam.police.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leosam.police.dao.PhoneDao;
import com.leosam.police.dao.PoliceCaseDao;
import com.leosam.police.dao.SuspectDao;
import com.leosam.police.entity.Phone;
import com.leosam.police.entity.PoliceCase;
import com.leosam.police.entity.Suspect;
import com.leosam.police.utis.ResultVO;

@Service
public class PoliceCaseServiceImpl implements PoliceCaseService {
	@Autowired
	private PoliceCaseDao policeCaseDao;

	@Autowired
	private PhoneDao phoneDao;

	@Autowired
	private SuspectDao suspectDao;
	@Override
	public ResultVO<PoliceCase> listPoliceCase(int page, int limit, PoliceCase policeCase) {
		return policeCaseDao.listPoliceCase(page, limit, policeCase);
	}

	@Override
	public PoliceCase getPoliceCase(String id) {
		return policeCaseDao.getPoliceCase(id);
	}

	@Override
	public ResultVO<PoliceCase> policeCaseMod(String caseId, PoliceCase policeCase) throws Exception {
		if (policeCase == null || StringUtils.isBlank(policeCase.getId())) {
			return ResultVO.build(-1, "案件编号不合法");
		}
		if (StringUtils.isBlank(caseId)) {
			caseId = null;
		} else {
			if (!policeCase.getId().equalsIgnoreCase(caseId)) {
				return ResultVO.build(-1, "案件编号生成后禁止修改");
			}
		}
		PoliceCase policeCase1 = policeCaseDao.getPoliceCase(policeCase.getId());
		if (policeCase1 != null) {
			caseId = policeCase.getId();
		}
		return policeCaseDao.savePoliceCase(caseId, policeCase);
	}

	@Override
	public ResultVO<Phone> listPhone(int page, int limit, Phone phone) {
		return phoneDao.listPhone(page, limit, phone);
	}

	@Override
	public Phone getPhone(Integer phoneId) {
		return phoneDao.getPhone(phoneId);
	}

	@Override
	public ResultVO phoneMod(Integer phoneId, Phone phone) throws Exception {
		if (phone == null) {
			return ResultVO.build(-1, "手机为空或编号不合法");
		}
		if (phoneId == null || phoneId == 0) {
			phoneId = null;
		} else {
			if (!phone.getId().equals(phoneId)) {
				return ResultVO.build(-1, "手机编号生成后禁止修改");
			}
		}
		Phone phone1 = phoneDao.getPhone(phone.getId());
		if (phone1 != null) {
			phoneId = phone.getId();
		}
		return phoneDao.savePhone(phoneId, phone);
	}

	@Override
	public ResultVO<Suspect> listSuspect(int page, int limit, Suspect suspect) {
		return suspectDao.listSuspect(page, limit, suspect);
	}

	@Override
	public Suspect getSuspect(Integer suspectId) {
		return suspectDao.getSuspect(suspectId);
	}

	@Override
	public ResultVO suspectMod(Integer suspectId, Suspect suspect) throws Exception {
		if (suspect == null) {
			return ResultVO.build(-1, "嫌疑人为空或编号不合法");
		}
		if (suspectId == null || suspectId == 0) {
			suspectId = null;
		} else {
			if (!suspect.getId().equals(suspectId)) {
				return ResultVO.build(-1, "手机编号生成后禁止修改");
			}
		}
		Suspect suspect1 = suspectDao.getSuspect(suspect.getId());
		if (suspect1 != null) {
			suspectId = suspect.getId();
		}
		return suspectDao.saveSuspect(suspectId, suspect);
	}

}
