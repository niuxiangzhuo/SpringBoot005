package com.example.demo.mapper;

import com.example.demo.pojo.PositionInformationSheet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface PositionInformationSheetMapper {
    PositionInformationSheet selectPositionInformationSheet(Integer jobsNumbers);
    List<PositionInformationSheet> selectPositionInformationSheets();
    Integer selectCountPositionInformationSheet();
    Integer updatePositionInformationSheet(PositionInformationSheet positionInformationSheet);
    Integer insertPositionInformationSheet(PositionInformationSheet positionInformationSheet);
    Integer deletePositionInformationSheet(Integer jobsNumbers);
}
