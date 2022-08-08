import axios from 'axios';

export class UsuarioService {
    
    urlBase = "http://localhost:8000/api-admin-ms-usuario";

    listarUsuarios(){
        return axios.get(this.urlBase + "/listar-usuario").then(res => res.data);
    }

    crearUsuario(usuario){
        return axios.get(this.urlBase + "", usuario).then(res => res.data);
    }
}
