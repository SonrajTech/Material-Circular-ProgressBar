# Add any ProGuard configurations specific to this
# extension here.

-keep public class in.sonraj.cpb.Cpb {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'in/sonraj/cpb/repack'
-flattenpackagehierarchy
-dontpreverify
