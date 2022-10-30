import { Assunto } from './assunto.model';
import { Usuario } from '../../features/usuarios/models/usuario.model';
export class Caderno {
  "idCaderno": number;
  "conteudo": string;
  "publicado": boolean;
  "assunto": Assunto;
  "usuario": Usuario;
}
