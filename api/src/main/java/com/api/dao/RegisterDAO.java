package com.api.dao;

import java.util.List;

import com.api.model.RegistrationVO;
import com.api.model.messageVO;

public interface RegisterDAO {
	
	void insert(RegistrationVO registerVO);

	List<RegistrationVO> search(RegistrationVO registerVO);

	List<RegistrationVO> findById(int id);

	List<RegistrationVO> login(RegistrationVO rvo);

	void sendMessages(messageVO mvo);

	void deleteMessage(messageVO mvo);

	List<messageVO> getMessages(messageVO mvo);
}
