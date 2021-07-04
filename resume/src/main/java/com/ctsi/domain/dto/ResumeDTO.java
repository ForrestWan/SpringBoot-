package com.ctsi.domain.dto;

import com.ctsi.ssdc.admin.domain.dto.CscpUserDTO;

import java.io.Serializable;

public class ResumeDTO implements Serializable{
    private Integer id;
    private String name;
    private static final long serialVersionUID = 1L;
    public ResumeDTO(){
    }
    public Integer getId(){return this.id;}
    public void setId(Integer id){this.id = id;}
    public String getName(){return this.name;}
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        } else if (that == null) {
            return false;
        } else if (this.getClass() != that.getClass()) {
            return false;
        } else {
            boolean var10000;
            label57:
            {
                label49:
                {
                    ResumeDTO other = (ResumeDTO) that;
                    if (this.getId() == null) {
                        if (other.getId() != null) {
                            break label49;
                        }
                    } else if (!this.getId().equals(other.getId())) {
                        break label49;
                    }

                    if (this.getName() == null) {
                        if (other.getName() != null) {
                            break label49;
                        }
                    } else if (!this.getName().equals(other.getName())) {
                        break label49;
                    }
                }

                var10000 = false;
                return var10000;
            }

           // var10000 = true;
            //return var10000;
        }
    }
    public int hashCode() {
        boolean prime = true;
        int result = 1;
         result = 31 * result + (this.getId() == null ? 0 : this.getId().hashCode());
        result = 31 * result + (this.getName() == null ? 0 : this.getName().hashCode());
        return result;
    }
}
