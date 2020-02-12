# build environment
FROM node:12.2.0-alpine as build
WORKDIR /app
ENV PATH /app/node_modules/.bin:$PATH
COPY package.json /app/package.json
RUN npm install
RUN npm install -g @angular/cli@9.0.1
COPY . /app
RUN ng build --output-path=dist

FROM nginx:1.16.0-alpine
COPY --from=build /app/dist /usr/share/nginx/html

# run nginx
CMD ["nginx", "-g", "daemon off;"]

#CMD ng serve --host 0.0.0.0
