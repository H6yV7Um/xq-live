package com.xq.live.service;/**
 * Created by zhangpeng32 on 2018/2/7.
 */

import com.xq.live.common.Pager;
import com.xq.live.model.ActInfo;
import com.xq.live.vo.in.ActInfoInVo;

import java.util.List;

/**
 * 活动service
 *
 * @author zhangpeng32
 * @create 2018-02-07 17:18
 **/
public interface ActInfoService {
    /**
     * 新增
     * @param actInfo
     * @return
     */
    Long add(ActInfo actInfo);

    /**
     * 更新
     * @param actInfo
     * @return
     */
    int update(ActInfo actInfo);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    ActInfo selectOne(Long id);

    /**
     * 分页查询活动列表
     * @return
     */
    Pager<ActInfo> list(ActInfoInVo inVo);

    /**
     * 查询热门活动列表
     * @param inVo
     * @return
     */
    List<ActInfo> top(ActInfoInVo inVo);
}
