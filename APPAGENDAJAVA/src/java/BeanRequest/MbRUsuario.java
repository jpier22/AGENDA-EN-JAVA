/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BeanRequest;

import Clases.Encrypt;
import Dao.DaoTUsuario;
import Pojo.Tusuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author KevinArnold
 */
@ManagedBean
@RequestScoped
public class MbRUsuario {

    /**
     * Creates a new instance of MbRUsuario
     */
    private Tusuario tUsuario;
    private List<Tusuario> listaTUsuario;
    private String txtContraseniaRepita;
    
    public MbRUsuario() {
        this.tUsuario=new Tusuario();
        this.tUsuario.setCodigoUsuario("");
        this.tUsuario.setSexo(true);
    }
    
    public String register()throws Exception
    {
        this.tUsuario.setContrasenia(Encrypt.sha512(this.tUsuario.getContrasenia()));
        DaoTUsuario daoTUsuario=new DaoTUsuario();
        daoTUsuario.register(this.tUsuario);
        
        return "/usuario/registrar";
    }
    
    public Tusuario gettUsuario() {
        return tUsuario;
    }

    public void settUsuario(Tusuario tUsuario) {
        this.tUsuario = tUsuario;
    }

    public List<Tusuario> getListaTUsuario() {
        return listaTUsuario;
    }

    public void setListaTUsuario(List<Tusuario> listaTUsuario) {
        this.listaTUsuario = listaTUsuario;
    }

    public String getTxtContraseniaRepita() {
        return txtContraseniaRepita;
    }

    public void setTxtContraseniaRepita(String txtContraseniaRepita) {
        this.txtContraseniaRepita = txtContraseniaRepita;
    }
    
}
