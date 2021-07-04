package com.ctsi.service.mapper.impl;

import com.ctsi.domain.Resume;
import com.ctsi.domain.dto.ResumeDTO;
import com.ctsi.service.mapper.ResumeMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResumeMapperImpl implements ResumeMapper {
    @Override
    public Resume toEntity(ResumeDTO resumeDTO) {
        return null;
    }

    @Override
    public ResumeDTO toDto(Resume resume) {
        return null;
    }

    @Override
    public List<Resume> toEntity(List<ResumeDTO> list) {
        return null;
    }

    @Override
    public List<ResumeDTO> toDto(List<Resume> list) {
        return null;
    }
}
