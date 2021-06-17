package com.example.demo.service;

import com.example.demo.pojo.PositionInformationSheet;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface PositionInformationSheetService {
    PositionInformationSheet selectPositionInformationSheet(Integer jobsNumbers);
    List<PositionInformationSheet> selectPositionInformationSheets();
    Integer selectCountPositionInformationSheet();
    Integer updatePositionInformationSheet(PositionInformationSheet positionInformationSheet);
    Integer insertPositionInformationSheet(PositionInformationSheet positionInformationSheet);
    Integer deletePositionInformationSheet(Integer jobsNumbers);
}