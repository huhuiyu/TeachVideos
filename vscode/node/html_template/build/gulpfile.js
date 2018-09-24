const gulp = require('gulp');
const watch = require('gulp-watch');
const browserSync = require('browser-sync').create();

gulp.task('default', function() {
  browserSync.init({
    server: {
      baseDir: '../html/'
    }
  });
  gulp.watch(['../html/**/*']).on('change', browserSync.reload);
});
