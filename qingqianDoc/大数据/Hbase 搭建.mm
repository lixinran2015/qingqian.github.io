<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1453554853873" ID="ID_790521275" MODIFIED="1453554863129" TEXT="Hbase &#x642d;&#x5efa;">
<node CREATED="1453554890094" ID="ID_1608729041" MODIFIED="1453554894947" POSITION="right" TEXT="&#x51c6;&#x5907;&#x5de5;&#x4f5c;">
<node CREATED="1453554902188" ID="ID_62208492" MODIFIED="1453554917576" TEXT="&#x6587;&#x4ef6;&#xff1a;hbase-1.1.2-bin.tar.gz"/>
</node>
<node CREATED="1453554895335" ID="ID_1646250723" MODIFIED="1454142492052" POSITION="right" TEXT="&#x6b63;&#x5f0f;&#x73af;&#x5883;">
<node CREATED="1453543971274" ID="ID_674233351" MODIFIED="1453555076713" TEXT="&#x8bbe;&#x7f6e;&#x73af;&#x5883;&#x53d8;&#x91cf;">
<node COLOR="#990000" CREATED="1452959666310" ID="37upcggi88kfmeph5fi8j1aj36" MODIFIED="1452960495765" STYLE="fork" TEXT="&#x8bbe;&#x7f6e;&#x6587;&#x4ef6; .bashrc">
<font NAME="SansSerif" SIZE="14"/>
</node>
<node COLOR="#990000" CREATED="1452959666310" ID="73edureu1gvf3u9h16j317m483" MODIFIED="1453555046434" STYLE="fork" TEXT="export HBASE_HOME=/home/hadoop/bigdata/hbase&#xa;export PATH=$HBASE_HOME/bin:$PATH">
<font NAME="SansSerif" SIZE="14"/>
<node COLOR="#111111" CREATED="1452959666310" ID="1igc45rikcgq8qj6i0vmfretnd" MODIFIED="1453558320447" STYLE="fork" TEXT="HBASE_HOME &#x8868;&#x793a;HBASE&#x5b89;&#x88c5;&#x76ee;&#x5f55;"/>
</node>
<node COLOR="#990000" CREATED="1452959666310" ID="03jhs12ofugfjdjo3p63tnp89f" MODIFIED="1452960495766" STYLE="fork" TEXT="source .bashrc">
<font NAME="SansSerif" SIZE="14"/>
</node>
<node COLOR="#990000" CREATED="1452959666311" ID="58mk2ubb0feg8sunekq8nvqehs" MODIFIED="1453544096863" STYLE="fork" TEXT="&#x9a8c;&#x8bc1;">
<font NAME="SansSerif" SIZE="14"/>
<node COLOR="#111111" CREATED="1452959666311" ID="06g568ee4jmf6lhkrjdgbk9td9" MODIFIED="1453555071397" STYLE="fork" TEXT="[hadoop@master ~]$ echo $HBASE_HOME&#xd;&#xa;/home/hadoop/bigdata/hbase"/>
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
<node CREATED="1453544490298" ID="ID_1966786744" MODIFIED="1453555112261">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      cd /home/hadoop/bigdata/<br />tar -zxf hbase-1.1.2-bin.tar.gz
    </p>
    <p>
      mv hbase-1.1.2-bin hbase<br />
    </p>
  </body>
</html></richcontent>
</node>
</node>
<node CREATED="1453555115785" ID="ID_1333404443" MODIFIED="1453555309761" TEXT="hbase-env&#x914d;&#x7f6e;">
<node CREATED="1453555155149" ID="ID_1079291191" MODIFIED="1453555241734" TEXT="cd /home/hadoop/bigdata/hbase/conf "/>
<node CREATED="1453555242273" ID="ID_633991461" MODIFIED="1453555306614" TEXT="export JAVA_HOME=/usr/java/jdk1.8.0_60"/>
</node>
<node CREATED="1453555308314" ID="ID_428244978" MODIFIED="1453555334493" TEXT="hbase-site&#x914d;&#x7f6e;">
<node CREATED="1453555155149" ID="ID_419758030" MODIFIED="1453555241734" TEXT="cd /home/hadoop/bigdata/hbase/conf "/>
<node CREATED="1453555328502" ID="ID_931122947" MODIFIED="1453555427348" TEXT=" &lt;property&gt;   &lt;name&gt;hbase.rootdir&lt;/name&gt;   &#xa;&lt;value&gt;hdfs://master:9000/hbase&lt;/value&gt;   &#xa;&lt;/property&gt;&#xa;&lt;property&gt;&#xa;&lt;name&gt;hbase.zookeeper.quorum&lt;/name&gt;&#xa;&lt;value&gt;master,slave01,slave02&lt;/value&gt;&#xa;&lt;/property&gt;&#xa;&lt;property&gt;&#xa;&lt;name&gt;hbase.cluster.distributed&lt;/name&gt;&#xa;&lt;value&gt;true&lt;/value&gt;&#xa; &lt;/property&gt;&#xa;&lt;property&gt;&#xa;&lt;name&gt;hbase.zookeeper.property.dataDir&lt;/name&gt;&#xa; &lt;value&gt;/home/hadoop/bigdata/zk/zkdata&lt;/value&gt;&#xa; &lt;/property&gt; "/>
</node>
<node CREATED="1453555446047" ID="ID_734298189" MODIFIED="1453555447812" TEXT="RegionServer">
<node CREATED="1453555450600" ID="ID_413317495" MODIFIED="1453555478710">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      slave01<br />slave02<br />
    </p>
  </body>
</html></richcontent>
</node>
</node>
</node>
<node CREATED="1453557014221" ID="ID_1622664885" MODIFIED="1454142489425" POSITION="right" TEXT="&#x542f;&#x52a8;&amp;&#x9a8c;&#x8bc1;">
<node CREATED="1453557026203" ID="ID_499326788" MODIFIED="1453557028475" TEXT="&#x542f;&#x52a8;">
<node CREATED="1453557032249" ID="ID_1191311797" MODIFIED="1453557246545" TEXT="master&#x673a;&#x5668;  start-hbase.sh"/>
</node>
<node CREATED="1453557248772" ID="ID_1894671279" MODIFIED="1454144006904" TEXT="&#x9a8c;&#x8bc1;">
<node CREATED="1453557255889" ID="ID_37533764" MODIFIED="1453557258802" TEXT="master">
<node CREATED="1453557313263" ID="ID_198583620" MODIFIED="1453557381070" TEXT="[hadoop@master bin]$ jps &#xa;14423 HMaster &#xa;15162 ResourceManager &#xa;4939 QuorumPeerMain &#xa;14813 NameNode &#xa;15007 SecondaryNameNode &#xa;14654 Jps"/>
<node CREATED="1453557510408" ID="ID_1555149807" MODIFIED="1453557528343" TEXT="[hadoop@master bin]$ ./hbase shell &#xa;SLF4J: Class path contains multiple SLF4J bindings. SLF4J: Found binding in [jar:file:/home/hadoop/bigdata/hbase/lib/slf4j-log4j12-1.7.5.jar!/org/slf4j/impl/StaticLoggerBinder.class] SLF4J: Found binding in [jar:file:/home/hadoop/bigdata/hadoop/share/hadoop/common/lib/slf4j-log4j12-1.7.10.jar!/org/slf4j/impl/StaticLoggerBinder.class] SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation. SLF4J: Actual binding is of type [org.slf4j.impl.Log4jLoggerFactory] 2016-01-23 13:56:28,572 WARN  [main] util.NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable HBase Shell; enter &apos;help&lt;RETURN&gt;&apos; for list of supported commands. Type &quot;exit&lt;RETURN&gt;&quot; to leave the HBase Shell Version 1.1.2, rcc2b70cf03e3378800661ec5cab11eb43fafe0fc, Wed Aug 26 20:11:27 PDT 2015 "/>
</node>
<node CREATED="1453557259517" ID="ID_1074275527" MODIFIED="1453557265468" TEXT="slave01">
<node CREATED="1453557273976" ID="ID_1036652588" MODIFIED="1453557296534" TEXT="[hadoop@slave02 .ssh]$ jps &#xa;14160 Jps &#xa;5778 DataNode &#xa;11924 QuorumPeerMain &#xa;13974 HRegionServer &#xa;5886 NodeManager "/>
</node>
</node>
<node CREATED="1453558031384" ID="ID_1343058866" MODIFIED="1454144012619" TEXT="&#x6d4b;&#x8bd5;&#x4ee3;&#x7801;">
<node CREATED="1453558152194" ID="ID_293750816" MODIFIED="1453558212970">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      #&#21019;&#24314;&#19968;&#20010;&#26032;&#34920;
    </p>
    <p>
      student create 'student','info'&#160;
    </p>
    <p>
      #&#26597;&#30475;&#25152;&#26377;&#30340;&#34920;
    </p>
    <p>
      list
    </p>
    <p>
      #&#26597;&#30475; student &#30340;&#34920;&#32467;&#26500;
    </p>
    <p>
      describe 'student'<br />#&#21516; student &#34920;&#20013;&#25554;&#20837;&#19968;&#26465;&#25968;&#25454;<br />put 'student','mary','info:age','19'
    </p>
    <p>
      #&#20174; student &#34920;&#20013;&#21462;&#20986; mary &#30340;&#25968;&#25454;
    </p>
    <p>
      get 'student','mary'
    </p>
    <p>
      #&#35753; student &#34920;&#22833;&#25928;
    </p>
    <p>
      disable 'student'
    </p>
    <p>
      #&#21024;&#38500; student &#34920;
    </p>
    <p>
      drop 'student'
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1454145248892" MODIFIED="1454145248892" TEXT="scan &apos;lixr&apos;;"/>
</node>
</node>
</node>
</map>
