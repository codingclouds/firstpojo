package com.leosam.police.service;

import com.leosam.police.entity.Phone;
import com.leosam.police.entity.PoliceCase;
import com.leosam.police.entity.Suspect;
import com.leosam.police.utis.ResultVO;

public interface PoliceCaseService {
	ResultVO<PoliceCase> listPoliceCase(int page, int limit, PoliceCase policeCase);
	PoliceCase getPoliceCase(String id);
	ResultVO<PoliceCase> policeCaseMod(String caseId, PoliceCase policeCase) throws Exception;

	ResultVO<Phone> listPhone(int page, int limit, Phone phone);
	Phone getPhone(Integer phoneId);
	ResultVO phoneMod(Integer phoneId, Phone phone) throws Exception;

	ResultVO<Suspect> listSuspect(int page, int limit, Suspect suspect);
	Suspect getSuspect(Integer suspectId);
	ResultVO suspectMod(Integer suspectId, Suspect suspect) throws Exception;

}