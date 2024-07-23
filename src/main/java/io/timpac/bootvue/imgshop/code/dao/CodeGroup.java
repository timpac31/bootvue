package io.timpac.bootvue.imgshop.code.dao;

import io.timpac.bootvue.imgshop.common.entity.DateEntity;
import io.timpac.bootvue.imgshop.config.jpa.BooleanToStringConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class CodeGroup {
    @Id @Column(name = "GROUP_CODE")
    private String groupCode;
    private String groupName;
    @Convert(converter = BooleanToStringConverter.class)
    private Boolean useYn;
    @Embedded
    private DateEntity dateEntity;
    @OneToMany(mappedBy = "codeGroup", cascade = CascadeType.ALL)
    private List<CodeDetail> codeDetails = new ArrayList<>();

    public void addCodeDetail(CodeDetail codeDetail) {
        codeDetail.setCodeGroup(this);
    }
}
