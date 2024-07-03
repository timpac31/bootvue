# 프로젝트 설정 시작
1. 백엔드 스프링 프로젝트 생성
- IntelliJ > new project > spring boot
2. 프론트엔드 Vue 프로젝트 생성
- 스프링 프로젝트 루트에서 터미널 오픈
```
npm create vite@latest frontend
cd frontend
npm install
```
- vite.config.js 설정 수정
```javascript
import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';

export default defineConfig({
  plugins: [vue()],
  build: {
    outDir: '../src/main/resources/static',
  },
  server: {
    proxy: {
      '/api': {
        target: 'http://localhost:8080',
        changeOrigin: true,
      },
    },
  },
});
```
3. vue 빌드하면 스프링 /src/main/resources/static 폴더에 빌드파일 배포됨
```
npm run build
```
4. gitignore 추가
 
