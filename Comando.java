public abstract  class Comando 
    {public abstract String Java ();
    
    public abstract ComandoTipo getTipo();
    
    public enum ComandoTipo 
    { Atribuicao, 
      Condicional,
      While,
      DoWhile,
      Ler,
      Escrever 
    }
}