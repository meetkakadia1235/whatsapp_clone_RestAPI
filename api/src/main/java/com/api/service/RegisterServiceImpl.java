package com.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dao.RegisterDAO;
import com.api.model.RegistrationVO;
import com.api.model.messageVO;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterDAO registerDAO;

	public void insert(RegistrationVO registerVO) {
		this.registerDAO.insert(registerVO);
	}
	

	public List<RegistrationVO> search(RegistrationVO registerVO) {
		return this.registerDAO.search(registerVO);
	}

	public List<RegistrationVO> findById(int id) {
		return this.registerDAO.findById(id);
	}


	@Override
	public List<RegistrationVO> login(RegistrationVO rvo) {
		return this.registerDAO.login(rvo);
	}


	@Override
	public void sendMessages(messageVO mvo) {
		this.registerDAO.sendMessages(mvo);
	}


	@Override
	public void deleteMessage(messageVO mvo) {
		this.registerDAO.deleteMessage(mvo);
	}


	@Override
	public List<messageVO> getMessages(messageVO mvo) {
		return this.registerDAO.getMessages(mvo);
	}


}