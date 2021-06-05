package com.hacktohire.mapper;

import org.mapstruct.Mapper;

import com.hacktohire.entity.BookEntity;
import com.hacktohire.model.BookModel;

@Mapper(componentModel="spring", uses= {})
public interface BookMapper {
	public BookModel mapToDTO(BookEntity entity);

}
