package com.ssg.webmvc_membermain.service;

import com.ssg.webmvc_membermain.dao.AdminDAO;
import com.ssg.webmvc_membermain.domain.AdminVO;
import com.ssg.webmvc_membermain.dto.AdminDTO;
import com.ssg.webmvc_membermain.util.MapperUtil;
import org.modelmapper.ModelMapper;

public enum AdminService {
    INSTANCE;
    private AdminDAO adminDAO;

    private ModelMapper modelMapper;

    AdminService() {
        adminDAO = new AdminDAO();
        modelMapper = MapperUtil.INSTANCE.getModelMapper();
    }

    public AdminDTO login(String mid, String mpw) throws Exception {
        AdminVO vo = adminDAO.getWithPassword(mid, mpw);
        AdminDTO adminDTO = modelMapper.map(vo, AdminDTO.class);


        return adminDTO;
    }
}
