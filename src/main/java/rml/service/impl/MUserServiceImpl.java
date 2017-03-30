package rml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rml.dao.MUserMapper;
import rml.model.MUser;
import rml.service.MUserService;

@Service("muserService")
public class MUserServiceImpl implements MUserService{

	@Autowired
	private MUserMapper muserMapper;
		
	@Override
	public List<MUser> getAll() {
		
		return muserMapper.getAll();
	}

	@Override
	public int insert(MUser muser) {
		
		return muserMapper.insert(muser);
	}

	@Override
	public int update(MUser muser) {
		
		return muserMapper.updateByPrimaryKey(muser);
	}

	@Override
	public int delete(String id) {
	
		return muserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public MUser selectByPrimaryKey(String id) {
		
		return muserMapper.selectByPrimaryKey(id);
	}

}