package com.example.demo.generator.domain;

import java.io.Serializable;

public class LabelDocumentRelation implements Serializable{

        /**
         *
         */
        private Integer id;

        /**
         *
         */
        private Integer labelId;

        /**
         *
         */
        private Integer documentId;
        private Integer sort;

        public Integer getSort() {
            return sort;
        }

        public void setSort(Integer sort) {
            this.sort = sort;
        }

        private static final long serialVersionUID = 1L;

        /**
         *
         */
        public Integer getId() {
            return id;
        }

        /**
         *
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         *
         */
        public Integer getClassficationId() {
            return labelId;
        }

        /**
         *
         */
        public void setClassficationId(Integer classficationId) {
            this.labelId = classficationId;
        }

        /**
         *
         */
        public Integer getDocumentId() {
            return documentId;
        }

        /**
         *
         */
        public void setDocumentId(Integer documentId) {
            this.documentId = documentId;
        }

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
            com.example.demo.generator.domain.ClassficationDocumentRelation other = (com.example.demo.generator.domain.ClassficationDocumentRelation) that;
            return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                    && (this.getClassficationId() == null ? other.getClassficationId() == null : this.getClassficationId().equals(other.getClassficationId()))
                    && (this.getDocumentId() == null ? other.getDocumentId() == null : this.getDocumentId().equals(other.getDocumentId()));
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
            result = prime * result + ((getClassficationId() == null) ? 0 : getClassficationId().hashCode());
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
            sb.append(", classficationId=").append(labelId);
            sb.append(", documentId=").append(documentId);
            sb.append(", serialVersionUID=").append(serialVersionUID);
            sb.append("]");
            return sb.toString();
        }
}
