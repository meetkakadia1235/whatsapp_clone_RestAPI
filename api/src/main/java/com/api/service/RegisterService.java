package com.api.service;

import java.util.List;

import com.api.model.RegistrationVO;
import com.api.model.messageVO;

public interface RegisterService{
	void insert(RegistrationVO regVO);

	List<RegistrationVO> search(RegistrationVO vo);

	List<RegistrationVO> findById(int id);

	List<RegistrationVO> login(RegistrationVO rvo);

	void sendMessages(messageVO mvo);

	void deleteMessage(messageVO mvo);

	List<messageVO> getMessages(messageVO mvo);
}