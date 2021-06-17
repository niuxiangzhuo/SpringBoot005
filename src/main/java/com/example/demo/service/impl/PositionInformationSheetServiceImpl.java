package com.example.demo.service.impl;

import com.example.demo.mapper.PositionInformationSheetMapper;
import com.example.demo.pojo.PositionInformationSheet;
import com.example.demo.service.PositionInformationSheetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionInformationSheetServiceImpl implements PositionInformationSheetService {

    @Resource
    private PositionInformationSheetMapper positionInformationSheetMapper;

    @Override
    public PositionInformationSheet selectPositionInformationSheet(Integer jobsNumbers) {
        return positionInformationSheetMapper.selectPositionInformationSheet(jobsNumbers);
    }

    @Override
    public List<PositionInformationSheet> selectPositionInformationSheets() {
        return positionInformationSheetMapper.selectPositionInformationSheets();
    }

    @Override
    public Integer selectCountPositionInformationSheet() {
        return positionInformationSheetMapper.selectCountPositionInformationSheet();
    }

    @Override
    public Integer updatePositionInformationSheet(PositionInformationSheet positionInformationSheet) {
        return positionInformationSheetMapper.updatePositionInformationSheet(positionInformationSheet);
    }

    @Override
    public Integer insertPositionInformationSheet(PositionInformationSheet positionInformationSheet) {
        return null;
    }

    @Override
    public Integer deletePositionInformationSheet(Integer jobsNumbers) {
        return null;
    }
}
