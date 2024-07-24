package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 标签图片关系表
 * @TableName label_document_relation
 */
@TableName(value ="label_document_relation")
@Data
public class LabelDocumentRelation implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 标签id
     */
    private Integer labeId;

    /**
     * 图片id
     */
    private Integer documentId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LabelDocumentRelation other = (LabelDocumentRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLabeId() == null ? other.getLabeId() == null : this.getLabeId().equals(other.getLabeId()))
            && (this.getDocumentId() == null ? other.getDocumentId() == null : this.getDocumentId().equals(other.getDocumentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLabeId() == null) ? 0 : getLabeId().hashCode());
        result = prime * result + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", labeId=").append(labeId);
        sb.append(", documentId=").append(documentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}