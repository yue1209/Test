package com.test.jpa.dao;

import com.test.jpa.Pojo.Jpa_User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface JpaRepository extends org.springframework.data.jpa.repository.JpaRepository<Jpa_User,Long> {
    @Query("delete from  Jpa_User where id=?1")
    @Modifying
    @Transactional
    void deleteById(@Param("id") int id);

//    @Modifying
//    @Query(value = "delete from t_sys_org_user where org_id=?1 and user_id=?2",nativeQuery = true)
//    int deleteUserFromOrg(Long orgId,Long userId);
}
