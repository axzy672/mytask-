package com.myspringannotation.dao;



import com.myspringannotation.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {
    @Select("SELECT*From apply WHERE student_number = #{studentNumber}")
    List<User> studySelect(int studentNumber);

    @Insert(" INSERT INTO apply (Name,Qq,type,time,Graduate_School,student_number,Daily_link,hope,teacher,know_from,create_at,update_at)"
            + "VALUES (#{Name},#{Qq},#{type},#{time},#{GraduateSchool},#{studentNumber},#{DailyLink},#{hope},#{teacher},#{knowFrom},#{createAt},#{updateAt})")
    int studyInsert(User user);

    @Update("UPDATE apply SET Name=#{Name} WHERE Id=#{id}")
    boolean studyUpdate(User user);

    @Delete("DELETE FROM apply WHERE Id=#{id}")
    boolean studyDelete(long id);

    @Select("SELECT (Name,Qq,type,time,Graduate_School,student_number,Daily_link,hope,teacher,know_from,create_at,update_at FROM apply")
    List<User> studentName();
}
