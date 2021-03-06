package com.xq.live.web.controllerForApp;/**
 * 主题回复controller
 *
 * @author zhangpeng32
 * @create 2018-01-17 19:08
 */

import com.xq.live.common.BaseResp;
import com.xq.live.common.Pager;
import com.xq.live.common.ResultStatus;
import com.xq.live.model.Comment;
import com.xq.live.service.CommentService;
import com.xq.live.vo.in.CommentInVo;
import com.xq.live.vo.out.CommentOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * 主题回复controller
 * @author lipeng
 * @create 2018-01-17 19:08
 **/
@RestController
@RequestMapping(value = "/app/cmt")
public class CommentForAppController {

    @Autowired
    private CommentService commentService;

    /**
     * 根据ID查询评论信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Comment get(@PathVariable(value = "id")  Long id){
        return new Comment();
    }

    /**
     * 新增一条记录
     * @param comment
     * @return
     */
    @RequestMapping(value = "/add",  method = RequestMethod.POST)
    public BaseResp<Long>  put(@Valid Comment comment, BindingResult result){
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            return new BaseResp<Long>(ResultStatus.FAIL.getErrorCode(), list.get(0).getDefaultMessage(), null);
        }
        Long id = commentService.add(comment);
        return new BaseResp<Long>(ResultStatus.SUCCESS, id);
    }

    /**
     * 删除一条评论
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete",  method = RequestMethod.POST)
    public BaseResp<Integer> delete(Long id){
        if(id == null){
            return new BaseResp<Integer>(ResultStatus.error_param_empty_id);
        }
        int res = commentService.delete(id);
        return new BaseResp<Integer>(ResultStatus.SUCCESS, res);
    }
/*    public BaseResp<Integer> delete(@Valid CommentInVo inVo, BindingResult result){
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            return new BaseResp<Integer>(ResultStatus.FAIL.getErrorCode(), list.get(0).getDefaultMessage(), null);
        }
        int res = commentService.delete(inVo);
        return new BaseResp<Integer>(ResultStatus.SUCCESS, res);
    }*/

    /**
     * 分页查询热门评论
     * @param inVo
     * @return
     */
    @RequestMapping(value = "/top",  method = RequestMethod.GET)
    public BaseResp<List<CommentOut>> top(CommentInVo inVo){
        List<CommentOut> list = commentService.top(inVo);
        return new BaseResp<List<CommentOut>>(ResultStatus.SUCCESS, list);
    }

    @RequestMapping(value = "/list",  method = RequestMethod.GET)
    public BaseResp<Pager<CommentOut>> list(CommentInVo inVo){
        if(inVo.getZanUserId()==null){
            return new BaseResp<Pager<CommentOut>>(-1,"zanUserId必填",null);
        }
        Pager<CommentOut> page = commentService.list(inVo);
        return new BaseResp<Pager<CommentOut>>(ResultStatus.SUCCESS, page);
    }
}
