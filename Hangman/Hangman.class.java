Êþº¾   4 ¬  Hangman/Hangman  java/lang/Object random Ljava/util/Random; misses Ljava/lang/StringBuffer; Word [Ljava/lang/String; TheWord Ljava/lang/String; Letter [C 	attempets I <init> ()V Code
      java/util/Random
  	      java/lang/StringBuffer   
     ! (Ljava/lang/String;)V	  #   % java/lang/String ' kind  ) card + circus - chicken / language 1 dog 3 egg 5 dung 7 factory 9 syria ; drill  = 	hedgehogs ? family A dance	  C 	 
	  E   LineNumberTable LocalVariableTable this LHangman/Hangman; GameMain
  L M  setWord
  O P  setRow
  R S T length ()I
  V W X delete (II)Ljava/lang/StringBuffer;	 Z \ [ java/lang/System ] ^ out Ljava/io/PrintStream; ` ?LetÂ´s start a new game
if you want to exit the game wirte exit
 b d c java/io/PrintStream e ! println showRow h java/lang/StringBuilder	  j  
 $ l m n valueOf (C)Ljava/lang/String;
 g   q  
 g s t u append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 g w x y toString ()Ljava/lang/String;
 b { | ! print i StackMapTable
     nextInt (I)I	    
 $ R 
showMisses
 b  e  (Ljava/lang/Object;)V isCharInWord (C)Z
 $    charAt (I)C guess C 	changeRow (C)V addToMisses
   t  ,(Ljava/lang/String;)Ljava/lang/StringBuffer; checkRow
    
    
     isLooser ()Z IsWinner getSecretWord quit ¥ Game is Over
 Z § ¨ © exit (I)V 
SourceFile Hangman.java !                   	 
                            »     y*· *» Y· µ *» Y· µ "*½ $Y&SY(SY*SY,SY.SY0SY2SY4SY6SY	8SY
:SY<SY>SY@Sµ B*µ D±    F              U 	 s  x  G       y H I    J      [     !*· K*· N*´ "*´ "¶ Q¶ UW² Y_¶ a±    F                 G       ! H I    f      }     0<§ $² Y» gY*´ i4¸ k· op¶ r¶ v¶ z*´ i¾¡ÿÙ±    F          #  /  G       0 H I    - }   ~    ü    M      D     **´ B*´ *´ B¾¶ 2µ ±    F   
       G        H I    P      z     )**´ ¶ ¼µ i<§ *´ i*U*´ ¶ ¡ÿí±    F       "  #  $  # ( & G       ) H I     }   ~    ü 
        9     ² Y*´ "¶ ±    F   
    ) 
 * G        H I          }     !=§ *´ ¶   ¬*´ i¾¡ÿé¬    F       -  .  /  -  3 G        ! H I     !      }   ~    ü              ,=§  *´ ¶   *´ i*´ ¶ U*´ i¾¡ÿÝ±    F       :  ;  <  : + > G        , H I     ,     ) }   ~    ü         T     *´ "» gY¸ k· op¶ r¶ v¶ W±    F   
    A  B G        H I                d     *¶  *· § *· ±    F       E  F  G  H  J G        H I         ~             M     *´ "¶ Ql¤ ¬¬    F       M  N  O G        H I   ~      ¡       r      <§ *´ i4*  ¬*´ i¾¡ÿê¬    F       S  T  U  S  V G         H I     }   ~    ü   ¢ y     /     *´ °    F       Z G        H I    £      ?     ² Y¤¶ a¸ ¦±    F       ]  ^  _ G        H I    ª    «