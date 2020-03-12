/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nicehair;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "usuario_principal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioPrincipal.findAll", query = "SELECT u FROM UsuarioPrincipal u")
    , @NamedQuery(name = "UsuarioPrincipal.findByIdUsuario", query = "SELECT u FROM UsuarioPrincipal u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "UsuarioPrincipal.findByNome", query = "SELECT u FROM UsuarioPrincipal u WHERE u.nome = :nome")
    , @NamedQuery(name = "UsuarioPrincipal.findBySobrenome", query = "SELECT u FROM UsuarioPrincipal u WHERE u.sobrenome = :sobrenome")
    , @NamedQuery(name = "UsuarioPrincipal.findBySenha", query = "SELECT u FROM UsuarioPrincipal u WHERE u.senha = :senha")
    , @NamedQuery(name = "UsuarioPrincipal.findByGenero", query = "SELECT u FROM UsuarioPrincipal u WHERE u.genero = :genero")
    , @NamedQuery(name = "UsuarioPrincipal.findByEmail", query = "SELECT u FROM UsuarioPrincipal u WHERE u.email = :email")
    , @NamedQuery(name = "UsuarioPrincipal.findByCpf", query = "SELECT u FROM UsuarioPrincipal u WHERE u.cpf = :cpf")
    , @NamedQuery(name = "UsuarioPrincipal.findByDtNascimento", query = "SELECT u FROM UsuarioPrincipal u WHERE u.dtNascimento = :dtNascimento")})
public class UsuarioPrincipal implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private BigDecimal idUsuario;
    @Size(max = 2147483647)
    @Column(name = "nome")
    private String nome;
    @Size(max = 2147483647)
    @Column(name = "sobrenome")
    private String sobrenome;
    @Size(max = 2147483647)
    @Column(name = "senha")
    private String senha;
    @Column(name = "genero")
    private Character genero;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "email")
    private String email;
    @Size(max = 2147483647)
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "dt_nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtNascimento;

    public UsuarioPrincipal() {
    }

    public UsuarioPrincipal(BigDecimal idUsuario) {
        this.idUsuario = idUsuario;
    }

    public BigDecimal getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(BigDecimal idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPrincipal)) {
            return false;
        }
        UsuarioPrincipal other = (UsuarioPrincipal) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.nicehair.UsuarioPrincipal[ idUsuario=" + idUsuario + " ]";
    }
    
}
