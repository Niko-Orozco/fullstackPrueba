import React, { Component } from "react";
import { UsuarioService } from "../../service/UsuarioService.jsx";
import { DataTable } from 'primereact/datatable';
import { Column } from "primereact/column";
import { Panel } from "primereact/panel";

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
        this.usuarioService.listarUsuarios().then(data => this.setState({ usuarios: data })
        );
    }
    
    render() { 
        return (
            <Panel header="Administracion de Usuarios" style={{ width: '70%', margin: '0 auto', marginTop: '20px' }}>
                <DataTable value={this.state.usuarios}>
                    <Column field="id" header="ID" ></Column>
                    <Column field="nombre" header="Nombre" ></Column>
                    <Column field="apellido" header="Apellido" ></Column>
                    <Column field="fechaDeNacimiento" header="Fecha de nacimiento" ></Column>
                    <Column field="estadoCivil" header="Estado civil" ></Column>
                    <Column field="tieneHermanos" header="Tiene hermanos" ></Column>
                    <Column field="estado" header="Estado" ></Column>
                    <Column field="roles" header="Roles" ></Column>
                </DataTable>
            </Panel>
        );
    }
}
