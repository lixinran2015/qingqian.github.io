<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1453510656396" ID="ID_689207917" MODIFIED="1453553270036" TEXT="zookepper&#x73af;&#x5883;&#x642d;&#x5efa;">
<node CREATED="1453553271609" ID="ID_1276440121" MODIFIED="1453554233188" POSITION="right" TEXT="&#x51c6;&#x5907;&#x5de5;&#x4f5c;">
<node CREATED="1453543343463" ID="ID_1228521701" MODIFIED="1453543384972" TEXT="&#x548c;&#x4e0a;&#x4e00;&#x7bc7; hadoop &#x76f8;&#x540c; http://www.jianshu.com/p/57ffe2e3a092"/>
<node CREATED="1453554236685" ID="ID_1128267416" MODIFIED="1453554304736" TEXT="&#x51c6;&#x5907;&#x6587;&#x4ef6; zookeeper-3.4.6.tar.gz"/>
</node>
<node CREATED="1453553276568" ID="ID_1368557432" MODIFIED="1453553321857" POSITION="right" TEXT="&#x6b63;&#x5f0f;&#x5b89;&#x88c5;">
<node CREATED="1453543971274" ID="ID_674233351" MODIFIED="1453543989350" TEXT="&#x8bbe;&#x7f6e;&#x73af;&#x5883;&#x53d8;&#x91cf;">
<node COLOR="#990000" CREATED="1452959666310" ID="37upcggi88kfmeph5fi8j1aj36" MODIFIED="1452960495765" STYLE="fork" TEXT="&#x8bbe;&#x7f6e;&#x6587;&#x4ef6; .bashrc">
<font NAME="SansSerif" SIZE="14"/>
</node>
<node COLOR="#990000" CREATED="1452959666310" ID="73edureu1gvf3u9h16j317m483" MODIFIED="1453553351865" STYLE="fork" TEXT="export ZK_HOME=/home/hadoop/bigdata/zk&#xa;export PATH=$ZK_HOME/bin:$PATH">
<font NAME="SansSerif" SIZE="14"/>
<node COLOR="#111111" CREATED="1452959666310" ID="1igc45rikcgq8qj6i0vmfretnd" MODIFIED="1453553369239" STYLE="fork" TEXT="ZK_HOME &#x8868;&#x793a;zookeeper&#x5b89;&#x88c5;&#x76ee;&#x5f55;"/>
</node>
<node COLOR="#990000" CREATED="1452959666310" ID="03jhs12ofugfjdjo3p63tnp89f" MODIFIED="1452960495766" STYLE="fork" TEXT="source .bashrc">
<font NAME="SansSerif" SIZE="14"/>
</node>
<node COLOR="#990000" CREATED="1452959666311" ID="58mk2ubb0feg8sunekq8nvqehs" MODIFIED="1453544096863" STYLE="fork" TEXT="&#x9a8c;&#x8bc1;">
<font NAME="SansSerif" SIZE="14"/>
<node COLOR="#111111" CREATED="1452959666311" ID="06g568ee4jmf6lhkrjdgbk9td9" MODIFIED="1453554472223" STYLE="fork">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      [hadoop@master ~]$ echo $ZK_HOME<br />/home/hadoop/bigdata/zk
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node COLOR="#990000" CREATED="1452959666311" ID="0mpa25tujnh3uo8otnb40je6nr" MODIFIED="1453544121787" STYLE="fork" TEXT="&#x62f7;&#x8d1d;&#x5230;slave&#x673a;&#x5668;">
<font NAME="SansSerif" SIZE="14"/>
<node COLOR="#111111" CREATED="1452959666311" ID="730nb5bt124spq4ov23iqc9fr2" MODIFIED="1452960495767" STYLE="fork" TEXT="scp .bashrc hadoop@192.168.0.167:/home/hadoop/"/>
<node COLOR="#111111" CREATED="1452959666311" ID="3893iepug528sm0dpge4sir0pe" MODIFIED="1452960495768" STYLE="fork" TEXT="scp .bashrc hadoop@192.168.0.168:/home/hadoop/"/>
</node>
<node COLOR="#cc6600" CREATED="1453544138437" ID="ID_1762363433" MODIFIED="1453544233414" TEXT="&#x9a8c;&#x8bc1;slave">
<node CREATED="1453544152788" ID="ID_1850229772" MODIFIED="1453544162684" TEXT="&#x65b9;&#x6cd5;&#x540c;master&#x7aef;"/>
</node>
</node>
<node CREATED="1453544474003" ID="ID_1715421676" MODIFIED="1453544486818" TEXT="&#x5b89;&#x88c5;&#x76ee;&#x5f55;">
<node CREATED="1453544490298" ID="ID_1966786744" MODIFIED="1453553474954">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      cd /home/hadoop/bigdata/<br />tar -zxf zookeeper-3.4.6.tar.gz
    </p>
    <p>
      mv zookeeper-3.4.6 zk<br />
    </p>
  </body>
</html></richcontent>
</node>
</node>
<node CREATED="1453544675106" ID="ID_1219907020" MODIFIED="1453553648908" TEXT="zoo.cfg &#x914d;&#x7f6e;">
<node CREATED="1453544660261" ID="ID_718405105" MODIFIED="1453553680377">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      cd /home/hadoop/bigdata/zk/conf
    </p>
    <p>
      cp zoo_sample.cfg zoo.cfg<br />
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1453544685245" ID="ID_461034252" MODIFIED="1453553682284" TEXT="&#x4fee;&#x6539;&#x7684;&#x5185;&#x5bb9;">
<node CREATED="1453550091228" ID="ID_243040310" MODIFIED="1453553751913" TEXT="dataDir=/home/hadoop/bigdata/zk/zkdata&#xa;server.1=master:2888:3888&#xa;server.2=slave01:2888:3888&#xa;server.3=slave02:2888:3888"/>
</node>
</node>
<node CREATED="1453553776739" ID="ID_894578571" MODIFIED="1453553781155" TEXT="myid&#x914d;&#x7f6e;">
<node CREATED="1453553783166" ID="ID_491089366" MODIFIED="1453553792349" TEXT="master&#x673a;&#x5668;&#x503c;&#x4e3a;1"/>
<node CREATED="1453553783166" ID="ID_461713517" MODIFIED="1453553810559" TEXT="slave01&#x673a;&#x5668;&#x503c;&#x4e3a;2"/>
<node CREATED="1453553783166" ID="ID_782012182" MODIFIED="1453553816946" TEXT="slave02&#x673a;&#x5668;&#x503c;&#x4e3a;3"/>
</node>
<node CREATED="1453553997506" ID="ID_1081810136" MODIFIED="1453554027847" TEXT="&#x5c06;zk&#x7684;&#x5185;&#x5bb9;&#x62f7;&#x8d1d;&#x5230;slave01&#x3001;slave02"/>
<node CREATED="1453544433345" ID="ID_1014624123" MODIFIED="1453551128384" TEXT="&#x542f;&#x52a8;&amp;&#x9a8c;&#x8bc1;">
<node CREATED="1453551131426" ID="ID_436636879" MODIFIED="1453551133090" TEXT="&#x542f;&#x52a8;">
<node CREATED="1453551135906" ID="ID_445190850" MODIFIED="1453554098010" TEXT="cd /home/hadoop/bigdata/zk/bin "/>
<node CREATED="1453551145705" ID="ID_485087699" MODIFIED="1453554107110" TEXT="./zkServer.sh start"/>
</node>
<node CREATED="1453551149576" ID="ID_1375049073" MODIFIED="1453551155069" TEXT="&#x9a8c;&#x8bc1;">
<node CREATED="1453551157701" ID="ID_740039110" MODIFIED="1453554140040" TEXT="./zkServer.sh status"/>
</node>
</node>
</node>
</node>
</map>
