package io.timpac.bootvue.imgshop.code.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CodeGroupJpaRepository extends JpaRepository<CodeGroup, String> {
    @Modifying
    @Query("DELETE FROM CodeDetail cd WHERE cd.codeGroup.groupCode = :groupCode")
    int deleteWithCodeDetail(String groupCode);
}
