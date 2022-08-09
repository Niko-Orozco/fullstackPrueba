import React, { Component } from "react";
import { UsuarioService } from "../../service/UsuarioService.jsx";
import { PanelUsuario } from '../../components/Panel/PanelUsuario';
import { ModalUsuarios } from "../../components/Modal/ModalUsuarios";

import 'primereact/resources/themes/lara-light-indigo/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';

export default class Start extends Component {
    constructor(){
        super();
        this.state = {
            usuarios: []
        }
        this.usuarioService = new UsuarioService();
    }

    componentDidMount(){
        this.usuarioService.listarUsuarios().then(data => this.setState({ usuarios: data }));
    }
    
    render() { 
        return (
            <div style={{ width: '70%', margin: '0 auto', marginTop: '20px' }}>
                <PanelUsuario usuarios={this.state.usuarios}/>
                <ModalUsuarios/>
            </div>
        );
    }
}
