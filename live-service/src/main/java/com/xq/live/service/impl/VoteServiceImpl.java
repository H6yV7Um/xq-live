package com.xq.live.service.impl;

import com.xq.live.dao.VoteMapper;
import com.xq.live.model.Vote;
import com.xq.live.service.VoteService;
import com.xq.live.vo.in.VoteInVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author zhangpeng32
 * @date 2018-02-21 21:08
 * @copyright:hbxq
 **/
@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteMapper voteMapper;

    @Override
    public Vote get(Long id) {
        return voteMapper.selectByPrimaryKey(id);
    }

    @Override
    public Long add(VoteInVo vote) {
        Vote in = new Vote();
        BeanUtils.copyProperties(vote,in);
        int ret = voteMapper.insert(in);
        if(ret < 1){
            return null;
        }
        return in.getId();
    }

    @Override
    public int delete(Long id) {
        return voteMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByInVo(VoteInVo inVo) {
        return voteMapper.deleteByInVo(inVo);
    }
}
