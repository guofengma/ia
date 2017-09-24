package com.njfu.wa.sys.service.impl;

import com.njfu.wa.sys.domain.WarnRecord;
import com.njfu.wa.sys.domain.util.Result;
import com.njfu.wa.sys.domain.util.ResultFactory;
import com.njfu.wa.sys.enums.WarnRecordFlagEnum;
import com.njfu.wa.sys.mapper.WarnRecordMapper;
import com.njfu.wa.sys.service.WarnRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarnRecordServiceImpl implements WarnRecordService {

    @Autowired
    private WarnRecordMapper warnRecordMapper;

    @Autowired
    private ResultFactory<List<WarnRecord>> resultFactory;

    @Autowired
    private ResultFactory<Integer> integerResultFactory;

    /**
     * 扫描大棚状态表，出现异常数据，插入报警记录
     */
    @Override
    public void scanFieldStatus() {
       // TODO 调用 check_warn
    }

    /**
     * 查询报警记录
     *
     * @param warnRecord fieldId warnType warnTime flag
     * @param start      start
     * @param end        end
     * @return data
     */
    @Override
    public List<WarnRecord> getWarnRecord(WarnRecord warnRecord, String start, String end) {
        return warnRecordMapper.selectWarnRecord(warnRecord, start, end);
    }


    /**
     * 查询未处理报警记录
     *
     * @return data
     */
    @Override
    public Result getUnHandleWarnRecord() {
        WarnRecord warnRecord = new WarnRecord();
        warnRecord.setFlag(WarnRecordFlagEnum.UNHANDLE.getCode());

        return resultFactory.dataResult(warnRecordMapper.selectWarnRecordByFlag(warnRecord));
    }

    /**
     * 修改报警记录处理标志
     *
     * @param ids  id
     * @param flag flag
     * @return message
     */
    @Override
    public Result modifyWarnRecord(Integer[] ids, String flag) {

        int res = warnRecordMapper.updateWarnRecord(ids, flag);

        if (res == 0) {
            return resultFactory.failMessage("修改报警记录处理标志失败！");
        }

        return resultFactory.successMessage("修改报警记录处理标志成功！");
    }

    /**
     * 获取未处理报警记录数量
     *
     * @return data
     */
    @Override
    public Result getUnhandleRecordCount() {
        WarnRecord warnRecord = new WarnRecord();
        warnRecord.setFlag(WarnRecordFlagEnum.UNHANDLE.getCode());

        int res = warnRecordMapper.selectCount(warnRecord);
        return integerResultFactory.dataResult(res);
    }

}