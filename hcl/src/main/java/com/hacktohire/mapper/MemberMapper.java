package com.hacktohire.mapper;

import org.mapstruct.Mapper;

import com.hacktohire.entity.MemberEnity;
import com.hacktohire.model.MemberModel;

@Mapper (componentModel="spring",uses= {})
public interface MemberMapper {
	
	public MemberModel maptoMember(MemberEnity enity);

}
