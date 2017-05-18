/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author Jesus
 */
public class NumeroSecreto {
     private static final int LIM_INF_PREDENT = 1;
   private static final int LIM_SUP_PREDENT = 100;
    private int limiteInferior;
    private int limiteSuperior;
    private int numero;
    private Random generedor;
    private Object generador;
   
   public void setRango(int limiteInferior, int limiteSuperior){
       
       if (limiteInferior > limiteSuperior){
           this.limiteInferior = LIM_INF_PREDENT;
           this.limiteSuperior = LIM_SUP_PREDENT;
       }
       else{
           this.limiteInferior = limiteInferior;
           this.limiteSuperior = limiteSuperior;
       }
   }
   public final void generar(){
       this.numero = generador.nextInt(limiteSuperior)+1;
   }
   public NumeroSecreto(int limiteInferior, int limiteSuperior){
       this.setRango(limiteInferior, limiteSuperior);
       this.generedor = new Random();
       this.generar();
       
       public NumeroSecreto(){
           this(LIM_INF_PREDENT, LIM_SUP_PREDET);
           
       }
       public int getNumeroSecreto(){
           return this.numero;
       }
       public int getLimiteInferior(){
           return this.limiteInferior;
       }
       public int getLimiteSuperior(){
           return this.limiteSuperior; 
           }
       public boolean esMoyor(int numero) {
           boolean elNumeroSecretoEsMayor;
           if (this.numero > numero){ 
             elNumeroSecretoEsMayor = true;
          }
           else{
               elNumeroSecretoEsMayor = false;
           }
           return elNumeroSecretoEsMayor;
       }
       public boolean esMenor(int numero){
           boolean elNumeroSecretoEsMenor = false;
           if(this.numero < numero){
               elNumeroSecretoEsMenor = true;
       }
       return elNumeroSecretoEsMenor;
       }
       public boolean esIgual(int numero){
           return (this.numero == numero);
       }

   
        }
    

           
       

