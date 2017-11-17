package com.njfu.wa.sys.service;

import com.njfu.wa.sys.domain.Crop;
import com.njfu.wa.sys.utils.Result;

import java.util.List;

public interface CropService {

    /**
     * 获取作物列表
     *
     * @param crop cropId cropName
     * @return data
     */
    List<Crop> getCrops(Crop crop);

    /**
     * 新增作物信息
     *
     * @param crop cropId cropName cropPs
     * @return message
     */
    Result addCrop(Crop crop);

    /**
     * 修改作物信息
     *
     * @param crop cropId cropName cropPs
     * @return message
     */
    Result modifyCrop(Crop crop);

    /**
     * 删除作物信息
     *
     * @param crop cropId
     * @return message
     */
    Result removeCrop(Crop crop);
}
