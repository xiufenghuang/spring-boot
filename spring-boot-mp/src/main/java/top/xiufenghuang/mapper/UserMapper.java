package top.xiufenghuang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.xiufenghuang.entity.UserDO;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}